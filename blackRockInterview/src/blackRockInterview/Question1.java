package blackRockInterview;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question1 {
	public static final String SEPARATOR = "@";
	private static String[] benchmark;
	public static final String COLON = ":";
	//public static double totalValue;
	
	static class Stock implements Comparable<Stock> {
		private String ticker;
		private String name;
		private int quantity;
		private double price;
		private double value;
		private double nav;
		private double benchmarkNav;
		private double benchmarkQuantity;
	
		public String toString(){
			String[] arr = new String[8];
			arr[0] = ticker;
			arr[1] = name;
			arr[2] = String.valueOf(quantity);
			arr[3] = String.format( "%.2f", price);
			arr[4] = String.format( "%.2f", value);
			arr[5] =  String.format( "%.2f", nav);
			arr[6] = String.format( "%.2f", benchmarkNav);
			arr[7] = String.format( "%.2f", benchmarkQuantity);
			
			return Arrays.toString(arr);
		}
		
		@Override
		public int compareTo(Stock other){
			return this.ticker.compareTo(other.ticker);
			
		}
	}
	
	static class Transaction {
		
		//Difference  = benchmark 
		//For regular trades
		public Transaction(int difference, String ticker){
			if(difference < 0){
			  this.transactionType = false;
			} else {
				this.transactionType = true;
			}
			this.quantity = Math.abs((double)difference);
			this.ticker = ticker;
			
		}
		
		
		//For balancing
		public Transaction(double difference, String ticker){
			if(difference > 0){
			  this.transactionType = false;
			  this.quantity = -1 * (double)difference;
			} else {
				this.transactionType = true;
				this.quantity = -1 * (double)difference;
			}
			//this.quantity = (double)difference;
			this.ticker = ticker;
			
		}
		
		
	    //Transaction type, 
	    private boolean transactionType;
	    //true -- buy
	    //false -- sell
	    private String ticker;
	    private double quantity;
	    
	    public String toString(){
	    	String[] split = new String[3];
	        if(!transactionType){
	            split[0] = "SELL";
	        } else {
	            split[0] = "BUY";
	        }
	       
	        split[1] = ticker;
	        split[2] = String.format( "%.2f", quantity);
	        
	        return Arrays.toString(split);
	        
	    }
	}
    /*
     * Complete the function below.
     *
 	 * Note: The questions in this test build upon each other. We recommend you
	 * copy your solutions to your text editor of choice before proceeding to
	 * the next question as you will not be able to revisit previous questions.
	 */
	
	public static boolean containsSeparator(String input){
		return input.contains(SEPARATOR);
	}
 

    public static int countHoldings(String input) {
    	if(!containsSeparator(input)){
    		return 0;
    	}
        return input.split(SEPARATOR).length;
    }
    
    public static String[] holdings(String portfolioString){
    	String[] inputArr = portfolioString.split(SEPARATOR);
    	Arrays.sort(inputArr);
    	return inputArr;
    	
    }
    
    public static String[] holdingsNoSort(String portfolioString){
    	String[] inputArr = portfolioString.split(SEPARATOR);
    	return inputArr;
    }
    
    public static String[] holdingsNoSort(String portfolioString, String separator){
    	String[] inputArr = portfolioString.split(separator);
    	return inputArr;
    }
    
    public static String[] holdings(String portfolioString, String separator){
    	String[] inputArr = portfolioString.split(separator);
    	Arrays.sort(inputArr);
    	return inputArr;
    	
    }
    
    static String printHoldingsNoBenchmark(String portfolioString) {
    	if(portfolioString.length() < 2){
    		return "";
    	}
    	//Get holdings
    	String[] inputArr = holdings(portfolioString);
    	for(int i = 0; i < inputArr.length;i++){
    		inputArr[i] = Arrays.toString(inputArr[i].split(","));
    	}
    	
    	//Remove end characters
    	String finalString = removeEndCharacters(Arrays.toString(inputArr));
        return finalString;
    }
    
    public static String removeEndCharacters(String s){
    	return s.substring(1, s.length()-1);
    }
    
    static String printHoldings(String portfolioString) {
    	String[] split = portfolioString.split(COLON);
    	benchmark = holdings(split[1]);
    	String portfolio = printHoldingsNoBenchmark(split[1]);
    	
        return portfolio;
    }
    
    
    

    static String generateTransactions2(String input) {
    	String[] split = input.split(COLON);
    	
    	//Get the holdings
    	benchmark = holdings(split[1]);
    	String[] portfolio = holdings(split[0]);
    
    	//declare an array of transactions to the length of the benchmark
        Transaction[] transactions = new Transaction[portfolio.length];
        for(int i = 0; i < transactions.length; i++){
            transactions[i] = createTransaction(portfolio[i],benchmark[i]);
        }
        String finalTransactions = Arrays.toString(transactions);
        return removeEndCharacters(finalTransactions);
        
    }
    
    public static Transaction createTransaction(String portfolioElement, String benchmarkElement){
    	String[] oneHolding = holdings(portfolioElement,",");
        String[] oneBenchmark = holdings(benchmarkElement, ",");
        
        //Get Ticker
        String ticker = oneHolding[1];
        
        //Get the quantities and the difference
        int holdingQuantity = Integer.valueOf(oneHolding[0]);
        int benchmarkQuantity = Integer.valueOf(oneBenchmark[0]);
        int difference = benchmarkQuantity - holdingQuantity;
        //Create a transaction
        Transaction newTransaction = new Transaction(difference,ticker);
        return newTransaction;
    	
    }
    
    static String printHoldingsWithWeight(String inputString) {
        String[] split = inputString.split(COLON);
    	
    	//Get the holdings
    	benchmark = holdingsNoSort(split[1]);
    	String[] portfolio = holdingsNoSort(split[0]);
    	
    	Stock[] stocks = new Stock[portfolio.length];
    	//Need to calculate total portfolio value;
    	double totalValue = 0;
    	
    	
    	for(int i = 0; i < portfolio.length; i++){
    		String[] oneHolding = holdings(portfolio[i],",");
    		String[] oneBenchmark = holdingsNoSort(benchmark[i],",");
    		Stock newStock = createStock(oneHolding, oneBenchmark);
    		totalValue += newStock.value;
            stocks[i] = newStock;
        }
    	
    	for(int i = 0; i < stocks.length; i++){
    		Stock eachStock = stocks[i];
    		eachStock.nav =  percentNAV(eachStock.value,totalValue);
        }
    	//System.out.println(totalValue);
    	Arrays.sort(stocks);
		return removeEndCharacters(Arrays.toString(stocks));
    }
    
    //Create a stock
    public static Stock createStock(String[] oneHolding, String[] oneBenchmark){
    	Stock newStock = new Stock();
    	newStock.quantity = Integer.valueOf(oneHolding[2]);
		newStock.name = oneHolding[1];
		newStock.ticker = oneHolding[0];
		newStock.price = Double.valueOf(oneBenchmark[3]);
		newStock.value = calculateValue(newStock.quantity, newStock.price);	
		return newStock;
    	
    }
    
    public static double calculateValue(int quantity, double price){
    	return (double)(quantity * price);
    }
    
    public static double percentNAV(double holdingValue, double portfolioValue){
    	return (holdingValue/portfolioValue) * 100;
    }


    //Generate transactions
    static String generateTransactions(String inputString) {
    	String[] split = inputString.split(COLON);
    	
    	//Get the holdings
    	benchmark = holdingsNoSort(split[1]);
    	String[] portfolio = holdingsNoSort(split[0]);
    	
    	Stock[] stocks = new Stock[portfolio.length];
    	double benchmarkTotalValue = 0;
    	//Need to calculate total portfolio value;
    	double totalValue = 0;
    	for(int i = 0; i < portfolio.length; i++){
    		String[] oneHolding = holdingsNoSort(portfolio[i],",");
    		String[] oneBenchmark = holdingsNoSort(benchmark[i],",");
    		//NAV values
    		Stock newStock = createStock(oneHolding, oneBenchmark);
    		totalValue += newStock.value;
    		newStock.nav =  percentNAV(newStock.value,totalValue);
    		
    		//Benchmark values
    		newStock.benchmarkQuantity = Double.valueOf(oneBenchmark[2]);
    		double benchmarkPortfolioValue = newStock.benchmarkQuantity * newStock.price;
    		benchmarkTotalValue += benchmarkPortfolioValue;
    		newStock.benchmarkNav = benchmarkPortfolioValue;	
            stocks[i] = newStock;
        }
    	Arrays.sort(stocks);
    	
    	//Create transaction array
    	Transaction[] array = new Transaction[stocks.length];
    	for(int i = 0; i < stocks.length; i++){
    		Stock cur = stocks[i];
    		double buySellOrder = calculateBuySellOrderToBalance(cur,totalValue,benchmarkTotalValue);
    		Transaction newTrans = new Transaction(buySellOrder, cur.ticker);
    		array[i] = newTrans;		
    	}
		return removeEndCharacters(Arrays.toString(array));
    }
    
    
    //Calculate buy sell order to balance
    public static double calculateBuySellOrderToBalance(Stock cur, double totalValue, double benchmarkTotalValue){
    	double totalPercentage = (cur.price * cur.quantity)/totalValue;
		double benchPercentage = (cur.price * cur.benchmarkQuantity )/benchmarkTotalValue;
		double difference = totalPercentage - benchPercentage;
		double valueToBuyOrSell = difference * totalValue;
		double sharesToBuyOrSell = valueToBuyOrSell/cur.price;
		
		return sharesToBuyOrSell;
		
    	
    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
        res = generateTransactions(_input);
        System.out.println(res);
    }

}
