package model;

public class GunReplicas {
private int id_gunReplicas;
private String fabric;
private String calibre;
public int getId_gunReplicas() {
	return id_gunReplicas;
}
public void setId_gunReplicas(int id_gunReplicas) {
	this.id_gunReplicas = id_gunReplicas;
}
public String getFabric() {
	return fabric;
}
public void setFabric(String fabric) {
	this.fabric = fabric;
}
public String getCalibre() {
	return calibre;
}
public void setCalibre(String calibre) {
	this.calibre = calibre;
}
@Override
public String toString() {
	return "GunRepilicas [" + 
			"id_gunReplicas=" + id_gunReplicas + 
			", fabric=" + fabric + 
			", calibre=" + calibre +
			"]";
}
}
