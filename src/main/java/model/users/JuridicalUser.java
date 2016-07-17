package model.users;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
     * Initialize juridical user with parameters:
     * @param firstName first name of the juridical user.
     * @param lastName last name of the juridical user.
     * @param emailAddress email address of the juridical user.
     * @param address address of the juridical user.
     * @param iban iban of the juridical user.
     * @param bank bank of the juridical user.
     * @param bic bic number of the bank.
     * @param company company of the juridical user.
     * @param eik eik number of the juridical user.
     * @param zddsNumber zdds number of the juridical user.
     */
    public JuridicalUser(String firstName,
                         String lastName,
                         String emailAddress,
                         String address,
                         String iban,
                         String bank,
                         String bic,
                         String company,
                         String eik,
                         String zddsNumber) {
        super(firstName, lastName,emailAddress ,address, iban, bank, bic);
        setCompany(company);
        setEik(eik);
        setZddsNumber(zddsNumber);
    }

    /**
     * Validates zdds number.
     * @param zddsNumber zdds number of the juridical user.
     */
    private void setZddsNumber(String zddsNumber) {
        pattern = Pattern.compile("\\A\\d+\\Z");
        matcher = pattern.matcher(zddsNumber);
        if (!matcher.find()) {
            throw new IllegalArgumentException("ZDDS is not correct.");
        }
        this.zddsNumber = zddsNumber;
    }

    /**
     * Validates eik number.
     * @param eik eik number of the juridical user.
     */
    private void setEik(String eik) {
        pattern = Pattern.compile("\\A\\d{9}\\Z");
        matcher = pattern.matcher(eik);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Eik is not correct.");
        }
        this.eik = eik;
    }

    /**
     * Validates company;
     * @param company company of the juridical user.
     */
    private void setCompany(String company) {
        this.company = company;
    }
}