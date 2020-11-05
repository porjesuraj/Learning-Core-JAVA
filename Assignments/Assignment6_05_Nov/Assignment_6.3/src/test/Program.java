package test;

import java.util.Random;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		Random generator = new Random();
		
		String[] articles =  {"the", "a", "one","some", "any"};
		
		String[] nouns = {"boy", "girl", "dog","town","car"};
		
	   String[] verbs = {"drove", "jumped","ran", "walked","skipped"};
		
	   String[] prepositions = {"to","from", "over", "under","on"};
	   
	   
	   for (int i = 0; i < 20; i++)
	   {
		   int article1 = generator.nextInt(articles.length);
		   int noun1 = generator.nextInt(nouns.length);
		   int verb1 = generator.nextInt(verbs.length);
		   int preposition1 = generator.nextInt(prepositions.length);
		   
		   int article2 = generator.nextInt(articles.length);
		   
		int noun2 = generator.nextInt(articles.length);
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(articles[article1]).append(" ")
		.append(nouns[noun1]).append(" ")
		.append(verbs[verb1]).append(" ")
		.append(prepositions[preposition1]).append(" ")
		.append(".\n");
		
		buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
		
		System.out.println(buffer.toString());
	}
	
	   
	   
	
	  
	   
	   
	   
	}

}


/*3. (Random Sentences) Write an application that uses random-
number generation to create sentences. Use four arrays of
strings called article, noun, verb and preposition. Create a
sentence by selecting a word at random from each array in the
following order: article, noun, verb, preposition, article and
noun. As each word is picked, concatenate it to the previous
words in the sentence.
The words should be separated by spaces. When the final sentence
is output, it should start with a capital letter and end with a
period. The application should generate and display 20
sentences.
The article array should contain the articles "the", "a", "one",
"some" and "any";
the noun array should contain the nouns "boy", "girl", "dog",
"town" and "car";
the verb array should contain the verbs "drove", "jumped",
"ran", "walked" and "skipped";
the preposition array should contain the prepositions "to",
"from", "over", "under" and "on". */










