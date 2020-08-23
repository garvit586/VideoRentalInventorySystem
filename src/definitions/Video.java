/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 19-08-2020
 *   Time: 23:18
 *   File: Video.java
 */
package definitions;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // exeption for boolean: the name starts with 'is' instead of 'get'

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
