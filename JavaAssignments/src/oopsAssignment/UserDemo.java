
package oopsAssignment;
public class UserDemo {
				public static void main(String[] args) {
				persistance1 fp=new FilePersistance();
					fp.persist();
					persistance1 dp=new DataPersistance();
					dp.persist();
				}
			}