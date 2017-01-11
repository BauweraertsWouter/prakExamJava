package be.kdg.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * HIER MAG JE NIETS WIJZIGEN
 */
@XmlRootElement(name = "portfolio")
public class PortFolio {
    private List<Foto> fotoLijst = new ArrayList<>();

    public List<Foto> getFotoLijst() {
        return fotoLijst;
    }

    @XmlElement(name = "foto")
    public void setFotoLijst(List<Foto> fotoLijst) {
        this.fotoLijst = fotoLijst;
    }
}
