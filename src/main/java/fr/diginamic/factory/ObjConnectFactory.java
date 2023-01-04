package fr.diginamic.factory;

public class ObjConnectFactory {
	
	public static ObjectConnecte getObjConnect (Type type, int volt) {
		if (type.equals(Type.tablette))
		{
			Tablette tab = new Tablette();
			tab.setLimiteVolts(volt);
			return tab;
		}
		if (type == Type.telephone)
		{
			TelephonePortable phone = new TelephonePortable();
			phone.setLimiteVolts(volt);
			return phone;
		}
		if (type == Type.enceinte)
		{
			EnceinteConnectee enceinte = new EnceinteConnectee();
			enceinte.setLimiteVolts(volt);
			return enceinte;
		}
		return null;
	}
	
}
