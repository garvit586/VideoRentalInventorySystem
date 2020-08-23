/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 23-08-2020
 *   Time: 13:09
 *   File: Main.java
 */
package execution;

import definitions.VideoStore;

import java.util.Scanner;

public class VideoLauncher {

    private static final int ADD_VIDEO = 1;
    private static final int CHECK_OUT_VIDEO = 2;
    private static final int RETURN_VIDEO = 3;
    private static final int RECEIVE_RATING = 4;
    private static final int LIST_INVENTORY = 5;
    private static final int EXIT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clientInput;
        VideoStore myVideoStore = new VideoStore();
        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Video: ");
            System.out.println("2. Check out Video: ");
            System.out.println("3. Return video: ");
            System.out.println("4. Receive Rating: ");
            System.out.println("5. list Inventory: ");
            System.out.println("6. Exit: ");
            System.out.println("Enter your choice (1....6):");
            clientInput = scanner.nextInt();
            switch (clientInput) {
                case ADD_VIDEO:
                    System.out.println("Enter the name of the video you want to add: ");
                    scanner.nextLine();
                    String videoname = scanner.nextLine();
                    myVideoStore.addVideo(videoname);
                    break;
                case CHECK_OUT_VIDEO:
                    System.out.println("Enter the name of the video you want to rent: ");
                    scanner.nextLine();
                    videoname = scanner.nextLine();
                    myVideoStore.doCheckOut(videoname);
                    break;
                case RETURN_VIDEO:
                    System.out.println("Enter the name of the video you want to retuen: ");
                    scanner.nextLine();
                    videoname = scanner.nextLine();
                    myVideoStore.doReturn(videoname);
                    break;
                case RECEIVE_RATING:
                    System.out.println("Enter the name of the video whose rating you want to set: ");
                    scanner.nextLine();
                    videoname = scanner.nextLine();
                    System.out.println("Enter the rating of " + videoname);
                    int rating = scanner.nextInt();
                    myVideoStore.receiveRating(videoname, rating);
                    break;
                case LIST_INVENTORY:
                    myVideoStore.listInventory();
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
        } while (clientInput != EXIT);
        scanner.close();
    }
}
