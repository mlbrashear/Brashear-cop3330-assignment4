/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mary Brashear
 */

package ucf.assignments;

public class List {
    public static void addItem() {
        /*
        prompt user for name of item
        prompt user for date of item
        prompt user for description of item
         */
    }

    public static void removeItem() {
        /*
        temp = -1
        prompt user for which item they wish to remove
        while(the name doesnt exist in list) {
            for(loop for number of items in list) {
                check if item exists user input
                temp = i
            }
            if (temp != -1)
                break
        }
        remove item from list using temporary variable
         */
    }

    public static void editTitle() {
        /*
        create string
        prompt user for new title name
        scan new name
        replace old name with new name
         */
    }

    public static void editDesc() {
        /*
        create string
        prompt user for new description
        scan new description
        replace old with new
         */
    }

    public static void editDate() {
        /*
        create string
        prompt user for new date
        scan new date
        replace old with new
         */
    }

    public static void save() {
        /*
        create file writer
        check for any new info
        write over any old info that has been changed
        fill in any new info
         */
    }

    public static void showComplete() {
        /*
        create empty string
        for(loop number of times as there are items in list) {
            go through each item to see if its checked
            if(item is checked) {
                next string slot = i
            }
        }
        show only the items that are within string
         */
    }

    public static void showIncomplete() {
        /*
        create empty string
        for(loop number of times as there are items in list) {
            go through each item to see if its unchecked
            if(item is unchecked) {
                next string slot = i
            }
        }
        show only the items that are within string
         */
    }

}
