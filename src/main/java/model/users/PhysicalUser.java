package model.users;

import java.util.regex.Pattern;

/**
 * This class represent physical user  witch will logged in the site.
 * Inheritance abstract class user and added egn.
 */
public class PhysicalUser extends User{

    private String egn;

    /**
     * Initialize physical user with parameters:
     *
     * @param firstName    - physical user first name.
     * @param lastName     - physical user last name.
     * @param emailAddress - physical user email address.
     * @param address      - physical user address.
     * @param iban         - physical user iban.
     * @param bank         - physical user bank name.
     * @param bic          - physical user bic.
     * @param egn          - physical user egn.
     */
    public PhysicalUser(String firstName,
                           String lastName,
                           String emailAddress,
                           String address,
                           String iban,
                           String bank,
                           String bic,
                           String egn) {
        super(firstName, lastName, emailAddress, address, iban, bank, bic);
        this.setEgn(egn);
    }


    /**
     * Validates egn.
     * @param egn egn of the physical user.
     */
    private void setEgn(String egn) {
        pattern = Pattern.compile("\\A\\d{10}\\Z");
        matcher = pattern.matcher(egn);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Egn is not correct.");
        }
        this.egn = egn;
    }
}