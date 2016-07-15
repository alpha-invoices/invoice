package model.interfaces;

import model.Subject;
import model.Template;

/**
 * Interface that shows what functionality a registered user has
 * 
 *
 */
public interface UserFunctionality {

	void addReceiver(Receiver receiver);

	void addSubject(Subject subject);

	void addCustomTemplate(Template template);
}
