package model.users;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Subject;
import model.Template;
import model.interfaces.Receiver;
import model.interfaces.UserFunctionality;

/**
 * Class for representing a User logged into the site.
 *
 */
abstract class User implements UserFunctionality {

	private Set<Receiver> recievers;
	private Set<Subject> subjects;
	private Set<Template> customTemplates;
	private Pattern pattern;
	private Matcher matcher;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String address;
	private String iban;
	private String bank;
	private String bic;

	/**
	 * Initialize user with parameters:
	 * @param firstName - user first name.
	 * @param lastName - user last name.
	 * @param emailAddress - user email address.
	 * @param address - user address.
	 * @param iban - user iban.
     * @param bank - user bank name.
     * @param bic - user bic.
     */
	protected User(String firstName, String lastName, String emailAddress, String address, String iban, String bank, String bic) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmailAddress(emailAddress);
		this.setAddress(address);
		this.setIban(iban);
		this.setBank(bank);
		this.setBic(bic);
	}

	/**
	 * Validates user first name.
	 * @param firstName - user first name.
     */
	private void setFirstName(String firstName) {
		pattern = Pattern.compile("\\A[A-Za-z]+$");
		matcher = pattern.matcher(firstName);
		if (!matcher.find()){
			throw new IllegalArgumentException("First is not correct");
		}
		this.firstName = firstName;
	}

	/**
	 * Validates user last name.
	 * @param lastName - user last name.
     */
	private void setLastName(String lastName) {
		pattern = Pattern.compile("\\A[A-Za-z]+$");
		matcher = pattern.matcher(lastName);
		if (!matcher.find()){
			throw new IllegalArgumentException("Last is not correct");
		}
		this.lastName = lastName;
	}

	/**
	 * Validates user email address.
	 * @param emailAddress - user email address
     */
	private void setEmailAddress(String emailAddress) {
		pattern = Pattern.compile("\\A[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+\\Z");
		matcher = pattern.matcher(emailAddress);
		if (!matcher.find()){
			throw new IllegalArgumentException("Email is not correct");
		}
		this.emailAddress = emailAddress;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * Validates user IBAN.
	 * @param iban - user IBAN.
     */
	private void setIban(String iban) {
		pattern = Pattern.compile("\\A[A-Za-z0-9]{22}$");
		matcher = pattern.matcher(iban);
		if (!matcher.find()){
			throw new IllegalArgumentException("Iban is not correct");
		}
		this.iban = iban;
	}

	/**
	 * Validates user BIC.
	 * @param bic - user BIC.
     */
	private void setBic(String bic) {
		pattern = Pattern.compile("\\A[A-Z0-9]{8}$");
		matcher = pattern.matcher(bic);
		if (!matcher.find()){
			throw new IllegalArgumentException("Bic is not correct");
		}
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
