package io.swagger.api.fakeBackend;

import java.util.Arrays;
import java.util.List;

import io.swagger.model.Note;

public class NotesCreator {

	public static List <Note>  getNotes(){
		
		Note note1 = new Note();
		note1.name("ChemistryChapter1");
		note1.category("Chemistry");
		note1.content("Radioactive decay (also known as nuclear decay, radioactivity or nuclear radiation) is the process by which an unstable atomic nucleus loses energy (in terms of mass in its rest frame) by emitting radiation, such as an alpha particle, beta particle with neutrino or only a neutrino in the case of electron capture, or a gamma ray or electron in the case of internal conversion. A material containing such unstable nuclei is considered radioactive. Certain highly excited short-lived nuclear states can decay through neutron emission, or more rarely, proton emission.\r\n" + 
				"Radioactive decay is a stochastic (i.e. random) process at the level of single atoms. According to quantum theory, it is impossible to predict when a particular atom will decay,[1][2][3] regardless of how long the atom has existed. However, for a collection of atoms, the collection's expected decay rate is characterized in terms of their measured decay constants or half-lives. This is the basis of radiometric dating. The half-lives of radioactive atoms have no known upper limit, spanning a time range of over 55 orders of magnitude, from nearly instantaneous to far longer than the age of the universe.\r\n" + 
				"A radioactive nucleus with zero spin can have no defined orientation, and hence emits the total momentum of its decay products isotropically (all directions and without bias). If there are multiple particles produced during a single decay, as in beta decay, their relative angular distribution, or spin directions may not be isotropic. Decay products from a nucleus with spin may be distributed non-isotropically with respect to that spin direction, either because of an external influence such as an electromagnetic field, or because the nucleus was produced in a dynamic process that constrained the direction of its spin. Such a parent process"
				+ " could be a previous decay, or a nuclear reaction.[4][5][6][note 1]");
		note1.tags(Arrays.asList("Science","Chemistry","Radioactivity"));
		
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
