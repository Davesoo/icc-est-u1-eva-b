package Controllers;
import Models.Book;

public class LibroController {
    public void sortByBubbleAsc (Book[] books){
        for (int i = 0; i < books.length - 1; i++){
            for(int j = 1; j < books.length - 1; j++){
                String temp = books[i].getName();
                books[j].getName().equalsIgnoreCase(books[j+1]);
                books[j+1].getName() = books[i].getName();
            }
        }
    }

    public int searchByName (Book[] books, String name){
        int bajo=0;
        int alto = books.length + 1;
        while (alto >= bajo) {
            int central = (alto + bajo)/2;
            if (books[central].getName().equalsIgnoreCase(name)){
                return central;
            }
            if (books[central].getName().compareTo(name) > 0){
                central = alto - 1;
            }else{
                central = bajo + 1;
            }
        }
        return -1;
    }
}
