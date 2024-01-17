package LinkedList.SinglyLL;

public class DesignBrowserHistory {
    class Node{
    String url;
    Node next;
    Node prev;

    Node(){
        this.url = "0";
        this.next = this.prev = null;
    }

    Node(String url){
        this.url = url;
        this.next = this.prev = null;
    }

    Node(String url, Node front, Node back){
        this.url = url;
        this.next = front;
        this.prev = back;
    }
}

class BrowserHistory {
    Node current;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    public String back(int steps) {
        while(steps != 0){
            if(current.prev != null){
                current = current.prev;
            }else{
                break;
            }
            steps--;
        }
        return current.url;
    }

    public String forward(int steps) {
        while(steps != 0){
            if(current.next != null){
                current = current.next;
            }else{
                break;
            }
            steps--;
        }
        return current.url;
    }
}
// public static void main(String[] args) {
//         // Create a new BrowserHistory object with the homepage "google.com"
//         BrowserHistory browserHistory = new BrowserHistory("google.com");

//         // Visit some websites
//         browserHistory.visit("facebook.com");
//         browserHistory.visit("twitter.com");
//         browserHistory.visit("linkedin.com");

//         // Print the current URL
//         System.out.println("Current URL: " + browserHistory.current.url);

//         // Go back two steps
//         String backResult = browserHistory.back(2);
//         System.out.println("Back 2 steps. Current URL: " + backResult);

//         // Go forward one step
//         String forwardResult = browserHistory.forward(1);
//         System.out.println("Forward 1 step. Current URL: " + forwardResult);
//     }
}
