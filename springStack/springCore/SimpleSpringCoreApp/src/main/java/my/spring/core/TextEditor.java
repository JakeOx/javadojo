package my.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TextEditor {
	
	@Autowired
	TextEditorConfig propConfig;
	
	   private SpellChecker spellChecker;

	   public TextEditor(SpellChecker spellChecker){
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	   
	   public void spellCheck(){
	      spellChecker.checkSpelling();
	   }
	   
	   public void printAProperty(){
		   System.out.println(propConfig.getHost());
		   
	   }
	}
