package model.users;

import java.util.Set;

import model.Subject;
import model.Template;
import model.interfaces.Receiver;
import model.interfaces.UserFunctionality;

/**
 * Class for representing a User logged into the site.
 *
 */
public abstract class User implements UserFunctionality {

	private Set<Receiver> recievers;
	private Set<Subject> subjects;
	private Set<Template> customTemplates;



	private String firstName;
	private String lastName;
	private String address;
	private String iban;
	private String bank;
	private String bic;

	public User(String firstName, String lastName, String address, String iban, String bank, String bic) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setIban(iban);
		this.setBank(bank);
		this.setBic(bic);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}


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
