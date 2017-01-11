package be.kdg.parsing;

import be.kdg.model.Foto;
import be.kdg.model.PortFolio;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

/*
 * 2de zit examen Java2 - 18/08/2016
 */

public class ParsingTools {

    // TODO Te schrijven methode (3.1)
    public static void maakXML(List<Foto> fotoList, String fileName) {
        try {
            PortFolio pf = new PortFolio();
            pf.setFotoLijst(fotoList);

            JAXBContext context = JAXBContext.newInstance(PortFolio.class);

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            m.marshal(pf, new File(fileName));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // TODO Te schrijven methode (3.2)
    public static List<Foto> leesXML(String fileName) {
        try {
            JAXBContext jc = JAXBContext.newInstance(PortFolio.class);
            Unmarshaller um = jc.createUnmarshaller();

            File f = new File(fileName);
            PortFolio pf = (PortFolio)um.unmarshal(f);

            return pf.getFotoLijst();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
