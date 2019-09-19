/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishproject;

import cjb.ci.Mensaje;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;

/**
 *
 * @author mosh_
 */
public class ManipulaListas
{

    public static NodoArbol raiz;
    public static int contLet = 1;
    public static int contConc = 1;

    public static Nodo inserta(Nodo raiz, String[] s, int nivel, Nodo obj, Nodo ant)
    {
        Nodo temp = null;
        if (s.length - 1 == nivel)
        {
            LDLC lista = new LDLC();
            lista.setRaiz(raiz);
            lista.inserta(obj);
            
            Nodo x = lista.getRaiz();
            x.setArriba(ant);
            return x;
        } else
        {
            temp = busqueda(raiz, s[nivel]);
            temp.setAbajo(inserta(temp.getAbajo(), s, nivel + 1, obj, obj));
            return raiz;
        }
    }

    private static Nodo busqueda(Nodo raiz, String s)
    {
        Nodo aux = raiz;
        do
        {
            if (aux.getEtiqueta().equals(s))
            {
                break;
            } else
            {
                aux = aux.getSiguiente();
            }
        } while (aux != raiz);
        return aux;
    }

    public static Nodo busca(Nodo raiz, String[] s, int nivel)
    {
        if (s.length - 1 == nivel)
        {
            Nodo aux = busqueda(raiz, s[nivel]);
            return aux;
        } else
        {
            Nodo temp = busqueda(raiz, s[nivel]);
            return busca(temp.getAbajo(), s, nivel + 1);
        }
    }
    
    
    public static Nodo[] elimina(Nodo r, String s[], int nivel, Nodo n)
    {
        Nodo aux[] = new Nodo[2];
        if (s.length - 1 == nivel)
        {
            LDLC lt = new LDLC();
            lt.setRaiz(r);
            n = (Nodo) lt.elimina(s[nivel]);
            if (n.getArriba() != null)
            {
                n.getArriba().setAbajo(lt.getRaiz());
                n.setArriba(null);
            }
            aux[0] = lt.getRaiz();
            aux[1] = n;
            return aux;
        } else
        {
            Nodo temp = busqueda(r, s[nivel]);
            aux = elimina(temp.getAbajo(), s, nivel + 1, n);
            aux[0] = r;
            return aux;
        }
    }

    

    public static Nodo carga(JFrame jf)
    {
        Nodo r = null;
        try
        {
            FileInputStream fis = new FileInputStream("Archivo.dat");
            ObjectInputStream arch = new ObjectInputStream(fis);
            String s[] = new String[1];
            //r = cR(null, s, arch);
            r = (Nodo) arch.readObject(); 
            arch.close();
        } catch (FileNotFoundException e)
        {
            Mensaje.error(jf, "No se encontro el archivo");
        } catch (Exception e)
        {
            Mensaje.error(jf, "Error..." + e.toString());
        }
        return r;
    }
//
//    private static Nodo cR(Nodo r, String[] s, ObjectInputStream arch)
//    {
//        try
//        {
//            Nodo aux = (Nodo) arch.readObject();
//            if (aux == null)
//            {
//                return r;
//            }MAni
//            if (aux.getObj() instanceof Letra)
//            {
//                s = new String[1];
//                s[0] = aux.getEtiqueta();
//                r = inserta(r, s, 0, aux, null);
//                System.out.println("Encontre a " + aux.getEtiqueta());
//                r = cR(r, s, arch);
//            } else
//            {
//                if (aux.getObj() instanceof Conceptos)
//                {
//                    String sAux[] = new String[2];
//                    sAux[0] = s[0];
//                    sAux[1] = aux.getEtiqueta();
//                    r = inserta(r, sAux, 0, aux, null);
//                    System.out.println("Encontre a "+aux.getEtiqueta());
//                    r = cR(r, s, arch);
//                }
//            }
//        } catch (FileNotFoundException e)
//        {
//            Mensaje.error(null, "No se encontro la direccion");
//        } catch (ClassNotFoundException ex)
//        {
//            Mensaje.error(null, "Error...."+ex.toString());
//        } catch(IOException e)
//        {
//            Mensaje.error(null,e.toString() );
//        }
//        return r;
//    }
    
    public static void guarda(Nodo r, JFrame jf) throws IOException
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("Archivo.dat");
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            
            arch.writeObject(r);
            arch.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e.toString());
        } catch (IOException ex )
        {
            System.out.println("No se pudo abrir el archivo");
        }catch(Exception ex)
        {
            System.out.println(ex.toString());
            Mensaje.error(jf, "No se guardo el archivo");
        }
    }

//    private static void gr(ObjectOutputStream arch, Nodo r, JFrame jf)
//    {
//        try{
//            
//        }catch(IOException ex){
//            System.err.println(ex.toString());
//        }
//        
//        
////        while (r != null)
////        {
////            LDLC lt = new LDLC();
////            lt.setRaiz(r);
////            Nodo aux = (Nodo)lt.elimina(r.getSiguiente().getEtiqueta());
////            Nodo temp = aux.getAbajo();
////            aux.setAbajo(null);
////            aux.setArriba(null);
////            r = lt.getRaiz();
////            try
////            {
////                arch.writeObject(aux);
////            } catch (IOException e)
////            {
////                System.out.println("No se puede guardar en el archivo"+e.toString());
////            }catch(Exception x)
////            {
////                System.out.println("Archivo no guardado "+x.toString());
////                Mensaje.error(jf, "Error en el WriteObject");
////            }
////            gr(arch, temp, jf);
////        }
//    }
    
    public static void gr1(Nodo r)
    {
        LDLC lt = new LDLC();
        lt.setRaiz(r);
        Nodo aux = (Nodo)lt.elimina(r.getSiguiente().getEtiqueta());
        Nodo temp = aux.getAbajo();
        aux.setAbajo(null);
        aux.setArriba(null);
        r = lt.getRaiz();
        System.out.println("De = "+aux.getEtiqueta());
    }
}
