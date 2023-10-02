/* Robot.java */
/* Generated By:JavaCC: Do not edit this line. Robot.java */
package uniandes.lym.robot.control;

import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;

import java.util.*;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Robot implements RobotConstants {

        public static final int NORTH = 0;
        public static final int SOUTH = 1;
        public static final int EAST = 2;
        public static final int WEST = 3;

        private RobotWorldDec world;


        void setWorld(RobotWorld w) {
                world = (RobotWorldDec) w;
        }


        String salida = "";

        Map<String, ArrayList<String>> Parametros = new HashMap<>();

        //Guarda todas las variables creadas
        Map<String, Integer> Variables = new HashMap<>();

        //Guarda todas las funciones creadas por el usuario
    Map<String, List<Instrucciones>> Funciones = new HashMap<>();

        // Guardar el codigo que se va a ejecutar
    ArrayList <Instrucciones> code = new ArrayList <Instrucciones> () ;


        public int revisarVar(String variable) {
          int var;
          if (Variables.containsKey(variable)) {
            var = Variables.get(variable);
            }

          else {
                  try {
                    var = Integer.parseInt(variable);
                    }
                  catch (NumberFormatException ee)
                        {throw new Error("\nThe value: "+variable+" needs to be a Inetger");}
          }
          return var;
        }

//----------------------------------------------------------------------------------------

private class Instrucciones {

String tipo;

String argx = "0";
String argy = "0";
String dir = "";

public Instrucciones(String tipo, String argx) {
  this.tipo = tipo;
  this.argx = argx;
  }

public Instrucciones(String tipo, String argx, String dir) {
  this.tipo = tipo;
  this.argx = argx;
  this.dir = dir.toLowerCase();
  }


public Instrucciones(String tipo, String argx, String argy, String dir) {
  this.tipo = tipo;
  this.argx = argx;
  this.argy = argy;
  this.dir = dir;
  }


public void setAtributos(String viejo, String nuevo) {
        if (argx.equals(viejo)) { this.argx = nuevo;}
        else if (argy.equals(viejo)) { this.argy = nuevo;}
        else if (dir.equals(viejo)) { this.dir = nuevo;}
  }

public void execute() throws Error {
  int x = revisarVar(argx);
  int y = revisarVar(argy);
  int facing = world.getFacing();
  switch (tipo) {

        case "jump":   world.setPostion(x, y) ; break;
        case "walk":   direction(); world.moveForward(x, false); if (dir.equals("xd")) {look(facing);} break;
        case "leap":  direction(); world.moveForward(x, true);  if (dir.equals("xd")) {look(facing);} break;
        case "turn":   direction() ; break;
        case "turnto":   direction(); break;
        case "drop":  world.putChips(x); break;
        case "get":  world.pickChips(x); break;
        case "grab":   world.grabBalloons(x); break;
        case "letgo":    world.putBalloons(x); break;
        case "=": Variables.put(dir, x); break;

}
}

private void direction() throws Error {
switch (dir) {

        case "right": world.turnRight(); dir = "xd"; break;
        case "left": world.turnRight(); world.turnRight(); world.turnRight(); dir = "xd"; break;
        case "around":
        case "back": world.turnRight(); world.turnRight(); dir = "xd"; break;
        case "north": look(NORTH); break;
        case "south": look(SOUTH); break;
        case "west": look(WEST); break;
        case "east": look(EAST); break;
  }

}

private void look(int direccion) {
        int facing = world.getFacing();

        while (facing != direccion) {
                world.turnRight();
                facing = world.getFacing();
          }
  }




public boolean condicionales() {

        boolean resp = false;
        switch (tipo) {
                case "facing": int facing = world.getFacing(); if (facing == orientacion()) { resp = true;} else { resp = false;} break;
                case "can": resp = false; break;
                // case "not": resp = !condicionales(); break;
          }
        return resp;
}

private int orientacion() {
        int resp = -1;
        switch(dir) {
                case "north": resp = NORTH; break;
                case "south": resp = SOUTH; break;
                case "west": resp = WEST; break;
                case "east": resp = EAST; break;
          }
        return resp;
  }

//public boolean can() {
//switch(tipo) {
//	case "jump":   world.setPostion(x, y) ; break;
//  	case "walk":   direction(); world.moveForward(x, false); if (dir.equals("xd")) {look(facing);} break;
//	case "leap":  direction(); world.moveForward(x, true);  if (dir.equals("xd")) {look(facing);} break;
//	case "turn":   direction() ; break;
//	case "turnto":   direction(); break;
//	case "drop":  world.putChips(x); break;
//	case "get":  world.pickChips(x); break;
//	case "grab":   world.grabBalloons(x); break;
//	case "letgo":    world.putBalloons(x); break;
//  }
//return true;
//  }

}
//----------------------------------------------------------------------------------------

private class Control {

private List<Instrucciones> lista;


}

//boolean command(uniandes.lym.robot.view.Console sistema):
  final public boolean command(Console sistema) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case DEFVAR:
    case DEFPROC:
    case JUMP:
    case WALK:
    case LEAP:
    case TURN:
    case TURNTO:
    case DROP:
    case GET:
    case GRAB:
    case LETGO:
    case NOP:
    case MOV:
    case RIGHT:
    case PUT:
    case PICK:
    case POP:
    case GO:
    case HOP:
    case NAME:
    case 43:{
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case DEFVAR:{
          VariableDefine(sistema);
          break;
          }
        case DEFPROC:{
          FunctionDefine(sistema);
          break;
          }
        case 43:{
          jj_consume_token(43);
          Block(sistema, "");
          jj_consume_token(44);
          break;
          }
        case JUMP:
        case WALK:
        case LEAP:
        case TURN:
        case TURNTO:
        case DROP:
        case GET:
        case GRAB:
        case LETGO:
        case NOP:
        case MOV:
        case RIGHT:
        case PUT:
        case PICK:
        case POP:
        case GO:
        case HOP:
        case NAME:{
          BlockSimple(sistema);
          jj_consume_token(45);
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case DEFVAR:
        case DEFPROC:
        case JUMP:
        case WALK:
        case LEAP:
        case TURN:
        case TURNTO:
        case DROP:
        case GET:
        case GRAB:
        case LETGO:
        case NOP:
        case MOV:
        case RIGHT:
        case PUT:
        case PICK:
        case POP:
        case GO:
        case HOP:
        case NAME:
        case 43:{
          ;
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          break label_1;
        }
      }
try { Thread.sleep(900);
                } catch (InterruptedException e) {
                  System.err.format("InterruptedException: %s%n", e);
        }

        System.out.println("Executing:");
        System.out.println(code);

        while (!code.isEmpty()) {
                Instrucciones i = code.remove(0);
                i.execute();
}
                {if ("" != null) return true;}
      break;
      }
    case 0:{
      jj_consume_token(0);
{if ("" != null) return false;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
}

  final public void OldCommands(Console sistema) throws ParseException {int x,y;
  salida=new String();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case RIGHT:{
      jj_consume_token(RIGHT);
world.turnRight();salida = "\nCommand: Turnright";
      break;
      }
    case MOV:{
      jj_consume_token(MOV);
      jj_consume_token(46);
      x = num();
      jj_consume_token(47);
world.moveForward(x,false);salida = "\nCommand: Moveforward ";
      break;
      }
    case HOP:{
      jj_consume_token(HOP);
      jj_consume_token(46);
      x = num();
      jj_consume_token(47);
world.moveForward(x,true);salida = "\nCommand:Jumpforward ";
      break;
      }
    case GO:{
      jj_consume_token(GO);
      jj_consume_token(46);
      x = num();
      jj_consume_token(48);
      y = num();
      jj_consume_token(47);
world.setPostion(x,y);salida = "\nCommand:GO ";
      break;
      }
    case PUT:{
      jj_consume_token(PUT);
      jj_consume_token(46);
      put();
      jj_consume_token(47);
      break;
      }
    case PICK:{
      jj_consume_token(PICK);
      jj_consume_token(46);
      get();
      jj_consume_token(47);
      break;
      }
    case POP:{
      jj_consume_token(POP);
      jj_consume_token(46);
      x = num();
      jj_consume_token(47);
world.popBalloons(x); salida = "\nComando:  Pop";
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
sistema.printOutput(salida);
}

// CAMBIOS AL PARSER PARA NUEVAS FUNCIONES:
  final public void Command(Console sistema, String esFuncion) throws ParseException {Token tDir = null;
  Token tValue;
  Token tValuex;
  Token tValuey;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case JUMP:{
      jj_consume_token(JUMP);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValuex = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValuex = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(48);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValuey = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValuey = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
      salida = "\nJUMP x: " + tValuex.image+", y: " + tValuey.image + ")";
      code.add(new Instrucciones("jump", tValuex.image, tValuey.image, null)); }
      else {Funciones.get(esFuncion).add(new Instrucciones("jump", tValuex.image, tValuey.image, null)); }
      break;
      }
    case WALK:{
      jj_consume_token(WALK);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 48:{
        jj_consume_token(48);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case DIRECTION:{
          tDir = jj_consume_token(DIRECTION);
          break;
          }
        case CARDINALDIR:{
          tDir = jj_consume_token(CARDINALDIR);
          break;
          }
        case WALKDIR:{
          tDir = jj_consume_token(WALKDIR);
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        ;
      }
      jj_consume_token(47);
Instrucciones agregar;
        if (tDir == null) {
        salida = "\nWALK v: " + tValue.image;
        agregar = new Instrucciones("walk", tValue.image);}
        else {
        salida = "\nWALK v: " + tValue.image + " d: " + tDir.image;
        agregar = new Instrucciones("walk", tValue.image, tDir.image); }

    if (esFuncion.isEmpty()) { code.add(agregar); }
    else { Funciones.get(esFuncion).add(agregar); }
      break;
      }
    case LEAP:{
      jj_consume_token(LEAP);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 48:{
        jj_consume_token(48);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case DIRECTION:{
          tDir = jj_consume_token(DIRECTION);
          break;
          }
        case CARDINALDIR:{
          tDir = jj_consume_token(CARDINALDIR);
          break;
          }
        case WALKDIR:{
          tDir = jj_consume_token(WALKDIR);
          break;
          }
        default:
          jj_la1[10] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[11] = jj_gen;
        ;
      }
      jj_consume_token(47);
Instrucciones agregar;
        if (tDir == null) {
        salida = "\nLEAP v: " + tValue.image;
        agregar = new Instrucciones("leap", tValue.image);}
        else {
        salida = "\nLEAP v: " + tValue.image + " d: " + tDir.image;
        agregar = new Instrucciones("leap", tValue.image, tDir.image); }

    if (esFuncion.isEmpty()) { code.add(agregar); }
    else { Funciones.get(esFuncion).add(agregar); }
      break;
      }
    case TURN:{
      jj_consume_token(TURN);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DIRECTION:{
        tDir = jj_consume_token(DIRECTION);
        break;
        }
      case TURNDIR:{
        tDir = jj_consume_token(TURNDIR);
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
    salida = "\nTURN d: " + tDir.image;
        code.add(new Instrucciones("turn", "0", tDir.image)); }
        else {Funciones.get(esFuncion).add(new Instrucciones("turn", "0", tDir.image)); }
      break;
      }
    case TURNTO:{
      jj_consume_token(TURNTO);
      jj_consume_token(46);
      tDir = jj_consume_token(CARDINALDIR);
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
    salida = "\nTURNTO d: " + tDir.image;
        code.add(new Instrucciones("turnto", "0", tDir.image)); }
        else {Funciones.get(esFuncion).add(new Instrucciones("turnto", "0", tDir.image)); }
      break;
      }
    case DROP:{
      jj_consume_token(DROP);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
    salida = "\nDROP v: " + tValue.image;
    code.add(new Instrucciones("drop", tValue.image)); }
    else { Funciones.get(esFuncion).add(new Instrucciones("drop", tValue.image)); }
      break;
      }
    case GET:{
      jj_consume_token(GET);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
    salida = "\nGET v: " + tValue.image;
    code.add(new Instrucciones("get", tValue.image)); }
    else {Funciones.get(esFuncion).add(new Instrucciones("get", tValue.image)); }
      break;
      }
    case GRAB:{
      jj_consume_token(GRAB);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
    salida = "\nGRAB v: " + tValue.image;
    code.add(new Instrucciones("grab", tValue.image)); }
    else {Funciones.get(esFuncion).add(new Instrucciones("grab", tValue.image)); }
      break;
      }
    case LETGO:{
      jj_consume_token(LETGO);
      jj_consume_token(46);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
if (esFuncion.isEmpty()) {
    salida = "\nLETGO v: " + tValue.image;
    code.add(new Instrucciones("letgo", tValue.image)); }
    else {Funciones.get(esFuncion).add(new Instrucciones("letgo", tValue.image)); }
      break;
      }
    case NOP:{
      jj_consume_token(NOP);
      jj_consume_token(49);
salida = "\nNOP";
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
sistema.printOutput(salida);
}

  final public void FunctionCall(Console sistema, String esFuncion) throws ParseException {Token Name;
  Token Value;
  ArrayList<String> parameters = new ArrayList<String>();
    Name = jj_consume_token(NAME);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 46:
    case 49:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 46:{
        jj_consume_token(46);
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case NUM:{
            Value = jj_consume_token(NUM);
            break;
            }
          case NAME:{
            Value = jj_consume_token(NAME);
            break;
            }
          default:
            jj_la1[18] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
parameters.add(Value.image);
          label_3:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case 48:{
              ;
              break;
              }
            default:
              jj_la1[19] = jj_gen;
              break label_3;
            }
            jj_consume_token(48);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case NUM:{
              Value = jj_consume_token(NUM);
              break;
              }
            case NAME:{
              Value = jj_consume_token(NAME);
              break;
              }
            default:
              jj_la1[20] = jj_gen;
              jj_consume_token(-1);
              throw new ParseException();
            }
parameters.add(Value.image);
          }
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case NUM:
          case NAME:{
            ;
            break;
            }
          default:
            jj_la1[21] = jj_gen;
            break label_2;
          }
        }
        jj_consume_token(47);
        break;
        }
      case 49:{
        jj_consume_token(49);
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
if (!Parametros.containsKey(Name.image)) {
      salida = "\nERROR FUNCION: " + Name.image + " NO DEFINIDA";
    } else {
      if (Parametros.get(Name.image).size() != parameters.size()) {
      salida = "\nFUNCION: " + Name.image + " CON PARAMETROS INCOMPLETOS"; }
      else {
      for (Instrucciones inst : Funciones.get(Name.image)) {
          for (int i=0; i<parameters.size(); i++) { inst.setAtributos( Parametros.get(Name.image).get(i), parameters.get(i) ); } }
          code.addAll(Funciones.get(Name.image));

      salida = "\nFUNCION: " + Name.image + " DEFINIDA"; }
    }
    sistema.printOutput(salida);
      break;
      }
    case EQUALS:{
      jj_consume_token(EQUALS);
      Value = jj_consume_token(NUM);
if (Variables.containsKey(Name.image)) {
                  if (esFuncion.isEmpty()) {
                  salida = "\nVAR " + Name.image + " = " + Value.image;
              code.add(new Instrucciones("=", Value.image, "0", Name.image)); }
              else {Funciones.get(esFuncion).add(new Instrucciones("=", Value.image, "0", Name.image)); }}
          else { salida = "ERROR NO SE PUEDE ASIGNAR UNA VARIABLE QUE NO EXISTE" ;}
          sistema.printOutput(salida);
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void FunctionDefine(Console sistema) throws ParseException {Token Name;
  Token Value;
  ArrayList<String> parameters = new ArrayList<String>();
  List<Instrucciones> instru = new ArrayList<Instrucciones>();
    jj_consume_token(DEFPROC);
    Name = jj_consume_token(NAME);
Funciones.put(Name.image, instru);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 46:{
      jj_consume_token(46);
      label_4:
      while (true) {
        Value = jj_consume_token(NAME);
parameters.add(Value.image);
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case 48:{
            ;
            break;
            }
          default:
            jj_la1[24] = jj_gen;
            break label_5;
          }
          jj_consume_token(48);
          Value = jj_consume_token(NAME);
parameters.add(Value.image);
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case NAME:{
          ;
          break;
          }
        default:
          jj_la1[25] = jj_gen;
          break label_4;
        }
      }
      jj_consume_token(47);
      break;
      }
    case 49:{
      jj_consume_token(49);
      break;
      }
    default:
      jj_la1[26] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
Parametros.put(Name.image, parameters);
    jj_consume_token(43);
    Block(sistema, Name.image);
    jj_consume_token(44);
salida = "\nFUNCION: " + Name.image + " DEFINIDA CON PARAMETROS " + Arrays.toString(parameters.toArray());
    sistema.printOutput(salida);
}

  final public void VariableDefine(Console sistema) throws ParseException {Token tVar;
  Token tValue;
  int var;
    jj_consume_token(DEFVAR);
    tVar = jj_consume_token(NAME);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUM:{
      tValue = jj_consume_token(NUM);
      break;
      }
    case NAME:{
      tValue = jj_consume_token(NAME);
      break;
      }
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
salida = "\nVAR " + tVar.image + " = " + tValue.image;
    var = revisarVar(tValue.image);
    Variables.put(tVar.image, var);
    sistema.printOutput(salida);
}

  final public void Block(Console sistema, String esFuncion) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case JUMP:
    case WALK:
    case LEAP:
    case TURN:
    case TURNTO:
    case DROP:
    case GET:
    case GRAB:
    case LETGO:
    case NOP:{
      Command(sistema, esFuncion);
      break;
      }
    case NAME:{
      FunctionCall(sistema, esFuncion);
      break;
      }
    case IF:
    case WHILE:
    case REPEAT:{
      CommandStructure(sistema, esFuncion);
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 45:{
      jj_consume_token(45);
      Block(sistema, esFuncion);
      break;
      }
    default:
      jj_la1[29] = jj_gen;
      ;
    }
}

  final public void BlockSimple(Console sistema) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case JUMP:
    case WALK:
    case LEAP:
    case TURN:
    case TURNTO:
    case DROP:
    case GET:
    case GRAB:
    case LETGO:
    case NOP:{
      Command(sistema, "");
      break;
      }
    case MOV:
    case RIGHT:
    case PUT:
    case PICK:
    case POP:
    case GO:
    case HOP:{
      OldCommands(sistema);
      break;
      }
    case NAME:{
      FunctionCall(sistema, "");
      break;
      }
    default:
      jj_la1[30] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void CommandStructure(Console sistema, String esFuncion) throws ParseException {Token tValue;
  boolean condi;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case IF:{
      jj_consume_token(IF);
      Condition(sistema, esFuncion);
      jj_consume_token(43);
      Block(sistema, esFuncion);
      jj_consume_token(44);
      jj_consume_token(ELSE);
      jj_consume_token(43);
      Block(sistema, esFuncion);
      jj_consume_token(44);
salida = "\nIF ";
    // TODO: Completar

      break;
      }
    case WHILE:{
      jj_consume_token(WHILE);
      Condition(sistema, esFuncion);
      jj_consume_token(43);
      Block(sistema, esFuncion);
      jj_consume_token(44);
salida = "\nWHILE ";
        // TODO: Completar 

      break;
      }
    case REPEAT:{
      jj_consume_token(REPEAT);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NUM:{
        tValue = jj_consume_token(NUM);
        break;
        }
      case NAME:{
        tValue = jj_consume_token(NAME);
        break;
        }
      default:
        jj_la1[31] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(TIMES);
      jj_consume_token(43);
      Block(sistema, esFuncion);
      jj_consume_token(44);
salida = "\nREPEAT ";
    // TODO: Completar

      break;
      }
    default:
      jj_la1[32] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
sistema.printOutput(salida);
}

  final public void Condition(Console sistema, String esFuncion) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FACING:{
      jj_consume_token(FACING);
      jj_consume_token(46);
      jj_consume_token(CARDINALDIR);
      jj_consume_token(47);
salida = "\nFACING ";
    // TODO: Completar

      break;
      }
    case CAN:{
      jj_consume_token(CAN);
      jj_consume_token(46);
      Command(sistema, esFuncion);
      jj_consume_token(47);
salida = "\nCAN ";
    // TODO: Completar

      break;
      }
    case NOT:{
      jj_consume_token(NOT);
      jj_consume_token(50);
      Condition(sistema, esFuncion);
salida = "\nNot ";
      break;
      }
    default:
      jj_la1[33] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
sistema.printOutput(salida);
}

// FUNCIONES VIEJAS
  final public 
void put() throws ParseException {int f=1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CHIPS:{
      jj_consume_token(CHIPS);
      jj_consume_token(48);
      f = num();
world.putChips(f); salida = "\nCommand:  Put Chips";
      break;
      }
    case BALLOONS:{
      jj_consume_token(BALLOONS);
      jj_consume_token(48);
      f = num();
world.putBalloons(f); salida = "\nCommand:  Put Balloons";
      break;
      }
    default:
      jj_la1[34] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void get() throws ParseException {int f=1;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CHIPS:{
      jj_consume_token(CHIPS);
      jj_consume_token(48);
      f = num();
world.pickChips(f);salida = "\nCommand:  Pick chips";
      break;
      }
    case BALLOONS:{
      jj_consume_token(BALLOONS);
      jj_consume_token(48);
      f = num();
world.grabBalloons(f);salida="\nCommand:  Pick balloons";
      break;
      }
    default:
      jj_la1[35] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

/**
 * Unsigned decimal number
 * @return the corresponding value of the string
 * @error  corresponding value is too large
 */
  final public 
int num() throws ParseException, Error {int total=1;
    jj_consume_token(NUM);
try
                {
                        total = Integer.parseInt(token.image);
                }
                catch (NumberFormatException ee)
                {
                        {if (true) throw new Error("\nNumber out of bounds: "+token.image+" !!");}
                }
                {if ("" != null) return total;}
    throw new Error("Missing return statement in function");
}

  /** Generated Token Manager. */
  public RobotTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[36];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xc001ffe0,0xc001ffe0,0xc001ffe1,0xc0000000,0x0,0x0,0x0,0xe0000,0x0,0x0,0xe0000,0x0,0x140000,0x0,0x0,0x0,0x0,0x1ff80,0x0,0x0,0x0,0x0,0x0,0x4000000,0x0,0x0,0x0,0x0,0x1a1ff80,0x0,0xc001ff80,0x0,0x1a00000,0x38000000,0x0,0x0,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0xa1f,0xa1f,0xa1f,0x1f,0x280,0x280,0x280,0x0,0x10000,0x280,0x0,0x10000,0x0,0x280,0x280,0x280,0x280,0x0,0x280,0x10000,0x280,0x280,0x24000,0x24000,0x10000,0x200,0x24000,0x280,0x200,0x2000,0x21f,0x280,0x0,0x0,0x60,0x60,};
	}

  /** Constructor with InputStream. */
  public Robot(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Robot(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Robot(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new RobotTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new RobotTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Robot(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(RobotTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 36; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[51];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 36; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 51; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

//----------------------------------------------------------------------------------------

}
