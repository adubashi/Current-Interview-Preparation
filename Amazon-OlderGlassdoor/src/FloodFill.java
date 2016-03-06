
/* FloodFill.java
 * Benedict Brown
 *
 * Takes an image file as a command-line argument,
 * and flood fills all black regions red.
 *
 * This program is intended primarily to demonstrate an
 * an application of depth-first search.
 *
 * NOTE: You will likely get a StackOverFlowException if you
 *       run this on large images, because Java's default stack
 *       size is quite limited.  The usual workaround for this
 *       is to maintain a stack of pixels that need to be filled.
 *       Instead of recursively calling flood(), you just push
 *       new pixels onto the stack.  flood() runs until the stack is
 *       empty.  Recursion is much more elegant though.
 */

import java.awt.*;

public class FloodFill {
    // getting your java program to pause properly requires
    // some absurd mumbo-jumbo
    private static void sleep(int msec) {
        try {
            Thread.currentThread().sleep(msec);
        } catch (InterruptedException e) { }
    }
    
    private static void flood(Picture img, boolean[][] mark,
                             int row, int col, Color srcColor, Color tgtColor) {
        // make sure row and col are inside the image
        if (row < 0) return;
        if (col < 0) return;
        if (row >= img.height()) return;
        if (col >= img.width()) return;
        
        // make sure this pixel hasn't been visited yet
        if (mark[row][col]) return;
        
        // make sure this pixel is the right color to fill
        if (!img.get(col, row).equals(srcColor)) return;
        
        // fill pixel with target color and mark it as visited
        img.set(col, row, tgtColor);
        mark[row][col] = true;

        // animate
        img.show();
        sleep(25);
        
        // recursively fill surrounding pixels
        // (this is equivelant to depth-first search)
        flood(img, mark, row - 1, col, srcColor, tgtColor);
        flood(img, mark, row + 1, col, srcColor, tgtColor);
        flood(img, mark, row, col - 1, srcColor, tgtColor);
        flood(img, mark, row, col + 1, srcColor, tgtColor);
    }
    
    public static void main(String[] args) {
        Picture img = new Picture(args[0]);
        boolean[][] mark = new boolean[img.height()][img.width()];
        
        img.show();
        for (int row = 0; row < img.height(); row++) {
            for (int col = 0; col < img.width(); col++) {
                flood(img, mark, row, col,
                      Color.BLACK, Color.RED);
            }
        }
    }
}
