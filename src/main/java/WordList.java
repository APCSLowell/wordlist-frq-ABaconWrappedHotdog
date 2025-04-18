import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int count = 0;
    for(int i=0; i<myList.size();i++){
      if(myList.get(i) == len){
        count++;
      }
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = myList.size();i<=0;i--){
      if(myList.get(i)==len){
        myList.remove(i);
      }
    }

  }
}
