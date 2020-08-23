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

    // 1. Non- parameterized constructor
    public Video() {
        videoName = "Sooryavansham";
        rating = 5;
        checkOut = true;
    }

    // 2. parameterized constructor
    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

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

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
