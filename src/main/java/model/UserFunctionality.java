package model;

/**
 * Interface that shows what functionality a registered user has
 * 
 *
 */
public interface UserFunctionality {

	void addReceiver(Receiver receiver);

	void addSubject(Subject subject);

	void createInvoice();
}
