/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 23-08-2020
 *   Time: 15:03
 *   File: VideoStore.java
 */
package definitions;

public class VideoStore {
    private Video[] store;

    public Video[] getStore() {
        return store.clone();
    }

    public void setStore(Video[] store) {
        this.store = store;
    }
}
