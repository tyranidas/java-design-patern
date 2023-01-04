package fr.diginamic.factory;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObjectConnecte tablette = ObjConnectFactory.getObjConnect(Type.tablette, 60);
			ObjectConnecte enceinte = ObjConnectFactory.getObjConnect(Type.enceinte, 20);
			ObjectConnecte phone = ObjConnectFactory.getObjConnect(Type.telephone, 120);
			
			System.out.println("téléphone a un voltage de "+phone.getLimiteVolts());
	}

}
