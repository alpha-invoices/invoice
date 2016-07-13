package model;

import java.util.List;

/**
 * Class for all of the minimum necessary data, to create an invoice.
 *
 *
 */
public class Data {
	/*
	 * Sender is implemented only by JuridicalDetail,because only juridical
	 * users can send invoices.
	 */
	Sender sender;
	/*
	 * Receiver is implemented both by JuridicalDetail and IndividualDetail.
	 */
	Receiver reciever;
	List<Subject> subjects;
}
