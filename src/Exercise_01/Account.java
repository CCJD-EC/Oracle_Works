/**
 * 
 */
package Exercise_01;

import javax.swing.JOptionPane;

/**
 * @author chrispc
 *
 */
public class Account {
	
	private String owner;
	public Double mount;
	
	Account(String owner){
		this.owner = owner;
	}
	Account(String owner, Double mount){
		this.owner = owner;
		this.mount = mount;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Double getMount() {
		return mount;
	}
	public void setMount(Double mount) {
		this.mount = mount;
	}
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", mount=" + mount + "]";
	}

	
	/*
	 * Special Methods*/
	
	public void inputMount(Double mount)	{
		if(mount>0) {
			this.mount = mount;
			JOptionPane.showMessageDialog(null, "The mount was inserted successfull");
		}else {
			JOptionPane.showMessageDialog(null, "The mount inserted can't be negative");
		}
	}
	
	public void withdrawMoney(Double mount) {
		this.mount = this.mount - mount;
		if(this.mount<0)
			this.mount = (double) 0;
		JOptionPane.showMessageDialog(null, "The mount was withdraw correctly, \n Your current mount is: "+ this.mount);
	}
	


}
