package model;

import java.util.Set;

import model.interfaces.Receiver;
import model.interfaces.UserFunctionality;

/**
 * Class for representing a User logged into the site.
 *
 */
public class User implements UserFunctionality {

	private Set<Receiver> recievers;
	private Set<Subject> subjects;
	private Set<Template> customTemplates;

	/**
	 * Adds given receiver object to the set of receivers of the user.
	 */
	public void addReceiver(Receiver receiver) {
		if (receiver != null) {
			this.recievers.add(receiver);
		} else {
			// loging?
			// exception?
			// sysout?
			System.out.println("Trying to add null receiver");
		}

	}

	/**
	 * Adds given subject object to the set of subjects of the user.
	 */
	public void addSubject(Subject subject) {
		if (subject != null) {
			this.subjects.add(subject);
		} else {
			// loging?
			// exception?
			// sysout?
			System.out.println("Trying to add null subject");
		}
	}

	/**
	 * Adds given template object to the set of templates of the user.
	 */
	public void addCustomTemplate(Template template) {
		if (template != null) {
			this.customTemplates.add(template);
		} else {
			// loging?
			// exception?
			// sysout?
			System.out.println("Trying to add null template");
		}
	}

}
