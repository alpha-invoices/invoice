package model.users;

/**
 * This class represent physical user  witch will logged in the site.
 * Inheritance abstract class user and added egn.
 */
public class PhysicalUser extends User{

    private String egn;

    /**
     * Initialize user with parameters:
     * @param firstName first name of the user.
     * @param lastName last name of the user.
     * @param address address of the user.
     * @param iban iban of the user.
     * @param bank bank of the user.
     * @param bic bic number of the bank.
     * @param egn egn of the user.
     */
    public PhysicalUser(String firstName,
                        String lastName,
                        String address,
                        String iban,
                        String bank,
                        String bic,
                        String egn) {
        super(firstName, lastName, address, iban, bank, bic);
        this.setEgn(egn);
    }

    /**
     * Validates egn.
     * @param egn egn of the user.
     */
    private void setEgn(String egn) {
        this.egn = egn;
    }
}