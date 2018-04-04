package nl.ou.dlwo.test;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MyBean implements Serializable {
	private static final long serialVersionUID = 42L;

	public void doIt() {
		System.out.println("done it");
	}

	public String getSomeValue() {
		System.out.println("get some text value that contains spaces");
		return "return some text value that contains spaces";
	}

}
