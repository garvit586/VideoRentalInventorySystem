/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 19-08-2020
 *   Time: 23:18
 *   File: Video.java
 */
package definitions;

import java.util.Objects;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    public Video() {
        videoName = "Sooryavansham";
        rating = 5;
        checkOut = true;
    }

    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    public Video(String videoName) {
        this.videoName = videoName;
        this.rating = 4;
        this.checkOut = false;
    }

    public void doCheckOut() {
        if (!checkOut) {// if video is not checked out(available to rent)
            setCheckOut(false);
        }
    }

    public void doReturn() {
        if (checkOut) {
            setCheckOut(false);
        }
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

    public String toString() {
        return String.format("Video Name: %s, Video Rating:%d, Is Video Available: %b", getVideoName(), getRating(), isCheckOut());
    }

    // video.equals(video2)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return isCheckOut() == video.isCheckOut() &&
                getRating() == video.getRating() &&
                Objects.equals(getVideoName(), video.getVideoName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), isCheckOut(), getRating());
    }
}
