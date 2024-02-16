package com.example.session6;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> historyStack = new Stack<>();

    //Create the method visitPage that adds the web page to the stack (push)
    public void visitPage(String url){
        this.historyStack.push(url);
        System.out.println("Visited page: " + url);
    }

    // Create the method goBack that prints the last page visited from the stack (pop)
    public void goBack(){
        if(!this.historyStack.isEmpty()){
            String currentPage = historyStack.pop();
            String previousPage = historyStack.peek();
            System.out.println("Previous page was: "+previousPage);
        }
        else {
            System.out.println("No more previous pages!");
        }

    }
    //Also create a printHistory method that shows all the pages visited
    public void printHistory(){
        System.out.println("The browser history:");
        for(String page : historyStack){
            System.out.println(" - "+page);
        }
    }
    public static void main(String[] args) {
        /*Create a BrowserHistory class that has a private field called historyStack
        Instantiate the browser history class and visit the following pages (Strings): Homepage, News and Sports
        * */
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitPage("Homepage");
        browserHistory.visitPage("News");
        browserHistory.visitPage("Sports");
        browserHistory.printHistory();
        browserHistory.goBack();
        browserHistory.printHistory();
    }
}
