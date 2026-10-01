//Name: Ryan S
//Date: 09/29/26
//Description: Changes and does stuff to words depending on what method you call.


public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //preconditions needs input into word
    public void add(String word){
     letters += word; // adds word 2 letters
    }
  //postcondition adds the input into the pool of "letters"

    //Use Math.random() to get a random character from the letters string and return it.
    // precon need getLetters();
    public char randomLetter(){
      String  letter = getLetters();
     int ranNum = (int) (Math.random()*letter.length() + 1); // returns a random number from 0 to word length
     char ranLetter = letter.charAt(ranNum);  //takes a letter from the random number
    return ranLetter; //returns random letter
    }

      
    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
    String letters = getLetters();  //sets Letter to value of letters using method
    String company = getCompany(); // sets company to value of company using method
    int middle = (int) letters.length()/2;  // finds the middle by dividing letter count.
    String firstSec  = letters.substring(0, middle); //separates the first half 
    String secondSec = letters.substring(middle, letters.length());//separates the second half
    String letCombine = firstSec + company + secondSec; //puts company in middle and combines both halfs into letterCombine.
        return letCombine; //returns and prints out the combined result
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        String word = getLetters();
        for (int i = 0;  i < word.length(); i++){  //iterates through list of letters
            String letter = word.substring(i, i + 1).toLowerCase();  //sets letter to the letter assigned to index 

           if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {  //checks 4 vowel
              this.letters = word.substring(0, i) + word.substring(i+1, word.length()); // removes vowel and breaks
              break;
           }
           System.out.println(word); //prints out the letters with the first vowel removed
        }
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        String letter = getLetters(); //sets letters
        int randomNum =(int)( Math.random()* (letter.length() - num + 1)); //finds random number in range
       String  word = letter.substring(0,randomNum) + letter.substring(randomNum + num ,letter.length()); //removes the number of letters in the random spot.
       System.out.println(word); //prints out the letters after the num of letters were removed
    }
    //pre con removes num letters random spot.
    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        String letters = getLetters(); //sets letters to letters
        String result = letters.replace(word, ""); // finds "word" in letters and removes
        this.letters = result;
    }
 }

