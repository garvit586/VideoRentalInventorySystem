/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 23-08-2020
 *   Time: 13:09
 *   File: Main.java
 */
package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setRating(5);
        video.setCheckOut(true);
        video.setVideoName("Baahubali: The Beginning");
        System.out.println(video.getVideoName());
        System.out.println(video.getRating());
        System.out.println(video.isCheckOut());
    }
}
