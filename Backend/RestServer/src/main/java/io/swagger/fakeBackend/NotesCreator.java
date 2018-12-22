package io.swagger.fakeBackend;

import java.util.Arrays;
import java.util.List;

import io.swagger.model.Note;

public class NotesCreator {

	public static List <Note>  getNotes(){
		
		Note note1 = new Note();
		note1.name("PhysicsChapter1");
		note1.category("Physics");
		note1.content("Relativity solutions from 1 to 10");
		note1.tags(Arrays.asList("Science","Physics","Relativity"));
		
		Note note2 = new Note();
		note2.name("PhysicsChapter2");
		note2.category("Physics");
		note2.content("Mechanics question");
		note2.tags(Arrays.asList("Science","Physics","Mechanics"));
		
		Note note3 = new Note();
		note3.name("MathsProbability");
		note3.category("Maths");
		note3.content("Probability chapter one solutions");
		note3.tags(Arrays.asList("Science","Maths","Probability"));
		
		return Arrays.asList(note1,note2, note3);
	}
}
