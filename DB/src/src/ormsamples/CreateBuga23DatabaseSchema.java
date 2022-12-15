/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateBuga23DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance());
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
