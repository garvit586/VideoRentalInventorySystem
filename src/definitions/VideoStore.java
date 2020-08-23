/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 23-08-2020
 *   Time: 15:03
 *   File: VideoStore.java
 */
package definitions;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[10];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video();
        }
    }

    public VideoStore(Video[] store) {
        this.store = store;
    }

    public Video[] getStore() {
        return store.clone();
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    /**
     * this method adds a Video to the videostore Inventory.
     *
     * @param name the name of the video to be added.
     */
    public void addVideo(String name) {
        // TODO add the video to the inventory (add it to the array).
        System.out.println(name + "was added to the inventory.");
    }

    /**
     * This method helps us to rent a video.
     *
     * @param name the name of the video you want to rent.
     */
    public void doCheckOut(String name) {
        System.out.println("Thank you for renting " + name + ".");
    }

}
