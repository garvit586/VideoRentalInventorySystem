/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 19-08-2020
 *   Time: 23:18
 *   File: Video.java
 */
package definitions;

public class Video {

    /*
     * Creating Definiton Classes : (Rules)
     * 1. Always set teh visibility modifier of a field to private unless otherwise specified.
     * 2.Always set the access modifier of a field to non-static unless otherwise specified.
     *
     * */
    // member variables == fields / variablesString
    private String videoName;
    private boolean checkOut;
    private int rating;

    // member functions == methods / functions
    /*
     * This method returns the name of video.
     * @return The name of the video
     * */
    public String getName() {
        return "";
    }

    /*
     * This method sets the checkout value of a video to true or false.
     * If the value is set to true , that means that a customer has rented the video.
     * */
    public void checkOut() {

    }
}
