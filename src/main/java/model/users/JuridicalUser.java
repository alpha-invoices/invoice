package model.users;

/**
 * This class represent juridical user  witch will logged in the site.
 * Inheritance abstract class user and added company
 * ,eik number and zdds number.
 */
public class JuridicalUser extends User {

    private String company;
    private String eik;
    private String zddsNumber;

    /**
     * Initialize user with parameters:
     * @param firstName first name of the user.
     * @param lastName last name of the user.
     * @param address address of the user.
     * @param iban iban of the user.
     * @param bank bank of the user.
     * @param bic bic number of the bank.
     * @param company company of the user.
     * @param eik eik number of the user.
     * @param zddsNumber zdds number of the user.
     */
    public JuridicalUser(String firstName,
                         String lastName,
                         String address,
                         String iban,
                         String bank,
                         String bic,
                         String company,
                         String eik,
                         String zddsNumber) {
        super(firstName, lastName, address, iban, bank, bic);
        setCompany(company);
        setEik(eik);
        setZddsNumber(zddsNumber);
    }

    /**
     * Validates zdds number.
     * @param zddsNumber zdds number of the user.
     */
    private void setZddsNumber(String zddsNumber) {
        this.zddsNumber = zddsNumber;
    }

    /**
     * Validates eik number.
     * @param eik eik number of the user.
     */
    private void setEik(String eik) {
        this.eik = eik;
    }

    /**
     * Validates company;
     * @param company company of the user.
     */
    private void setCompany(String company) {
        this.company = company;
    }
}