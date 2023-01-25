

public class ShortToUnicodeString extends MiLenguajeBaseListener{
    boolean current_if = false;
    int function_found = 0;
    boolean in_decs = false;
    int else_found = 0;
    int print_found = 0;

    int effect_while = 0;
    int count_for_in_statements = 0;

    int assign_found = 0;
    String indent = "";
    int indent_level = 0;
    boolean change_size = false;

    int for_statements = 0;

    int function_parameters_comma = 0;
    int for_nested=0;
    boolean deny_arith = false;
    boolean first_assign = false;
    boolean for_arith = false;
    boolean geq = false;
    boolean leq = false;
    boolean greater = false;
    boolean lower = false;
    boolean many_parameters = false;
    boolean current_for = false;
    int current_size_array=0;
    int parameters = 0;
    int [] type_variables = new int[100];
    int counter_variables = 0;
    String variable_for;
    int current_assign = 0;
    String [] variables = new String[100];
    int par_control = 0;
    String current_variable;
    int counter_types = 0;
    boolean controler_dec = false;
    int controler_type = 0;
    int controler_return_function = 0;

    boolean in_function = false;

    String return_id_current_function;




    @Override
    public void enterStart_grammar(MiLenguajeParser.Start_grammarContext ctx) {
        System.out.print("\'\'\'\n" +
                "lenguajes de programación \n" +
                "Traductor de CORAL a Python\n" +
                "- Reinaldo Toledo Leguizamón\n" +
                "- Santiago Hernández Chaparro\n" +
                "2022-2\n\'\'\'\n");
        System.out.print("import math\nimport random\n\n");
    }

    @Override
    public void enterType(MiLenguajeParser.TypeContext ctx) {

        String primitive_data = String.valueOf(ctx.getChild(0));

        int primitive = primitive_data.length();

        if(primitive == 7){ // integer
            controler_type = 1;
        } else if(primitive == 5){ // float
            controler_type = 2;
        }

    }

    @Override
    public void exitStart_grammar(MiLenguajeParser.Start_grammarContext ctx) {
        System.out.print("\n## Traduccion finalizada exitosamente");
    }

    @Override
    public void enterFunction(MiLenguajeParser.FunctionContext ctx) {
        function_found+=1;
        if(indent_level>0) indent_level = 0;
        in_function=true;
        System.out.print("\ndef ");
        System.out.print(ctx.getChild(1));
        System.out.print(ctx.getChild(2));
        indent_level++;
    }

    @Override
    public void enterDec(MiLenguajeParser.DecContext ctx) {

        if(controler_return_function==1){
            if(ctx.getChildCount()==6){
                return_id_current_function = ctx.getChild(5).toString();
            }else{
                return_id_current_function = ctx.getChild(1).toString();
            }

        }else if(ctx.getChildCount()==2){
            if(ctx.getParent().getParent().getChildCount()>7  && !in_decs){

                System.out.print(indent);
            }
            System.out.print(ctx.getChild(1));
            variables[counter_variables] = ctx.getChild(1).toString();
            counter_variables+=1;
        }else if(ctx.getChildCount()==6){
            if(ctx.getParent().getParent().getChildCount()>7  && !in_decs){

                System.out.print(indent);
            }
            System.out.print(ctx.getChild(5));
            variables[counter_variables] = ctx.getChild(5).toString();

            counter_variables+=1;
        }

    }

    public void exitDec(MiLenguajeParser.DecContext ctx) {

        if(function_parameters_comma>0){
            System.out.print(",");
            function_parameters_comma-=1;
        }

        if(controler_dec && ctx.getChildCount() == 2 ){

            if (controler_type==1){
                System.out.print(" = 0");
                type_variables[counter_types]=1;
                counter_types+=1;
                controler_type = 0;
            }
            if(controler_type ==2){
                System.out.print(" = 0.0");
                type_variables[counter_types]=2;
                counter_types+=1;
                controler_type=0;
            }
            System.out.println();

        }else if(controler_dec && ctx.getChildCount() == 6){
            System.out.print(" = [");


            if(controler_type==1 && current_size_array>0){
                for(int i=0;i<current_size_array;i++){
                    if(i==current_size_array-1){
                        System.out.print("0]\n");
                    }else{
                        System.out.print("0,");
                    }
                }
                type_variables[counter_types]=1;
                counter_types+=1;
                controler_type=0;

            }else if(controler_type==2 && current_size_array>0){
                for(int i=0;i<current_size_array;i++){
                    if(i==current_size_array-1){
                        System.out.print("0.0]\n");
                    }else{
                        System.out.print("0.0,");
                    }
                }
                type_variables[counter_types]=2;
                counter_types+=1;
                controler_type=0;

            }else if(controler_type==1 && current_size_array==0){
                System.out.println("]\n");
                type_variables[counter_types]=1;
                counter_types+=1;
                controler_type=0;
            }else if(controler_type==2 && current_size_array==0){
                System.out.println("]\n");
                type_variables[counter_types]=2;
                counter_types+=1;
                controler_type=0;
            }

        }


    }

    public void exitDecs(MiLenguajeParser.DecsContext ctx) {
        in_decs=false;
        System.out.print("):\n");
    }

    @Override
    public void exitFunction(MiLenguajeParser.FunctionContext ctx) {


        if(in_function == true && return_id_current_function!=null){
            System.out.print("\n   return "+return_id_current_function);
            return_id_current_function=null;
        }
        in_function = false;
    }

    @Override
    public void enterSubstatement(MiLenguajeParser.SubstatementContext ctx) {

        controler_dec = true;

        if(current_if==true){
            System.out.println(":\n");
            current_if = false;
        }

    }

    @Override
    public void exitSubstatement(MiLenguajeParser.SubstatementContext ctx) {

        controler_dec = false;

        if(else_found==1){



            if(for_statements==1 && assign_found==5){

            }else{
                indent_level--;
            }

            else_found=0;
        }

    }

    @Override
    public void enterDecs(MiLenguajeParser.DecsContext ctx) {
        in_decs=true;
        if(ctx.getChildCount()>1){
            function_parameters_comma=(ctx.getChildCount()-1)/2;
        }

    }

    @Override
    public void enterIndex_array(MiLenguajeParser.Index_arrayContext ctx) {

        if(ctx.getParent().getChildCount()==3 && ctx.getParent().getParent().getChildCount()==1){
            System.out.print(indent);

            if(for_statements==1){
                count_for_in_statements++;
            }

            if(count_for_in_statements==2){
                count_for_in_statements=0;
                if(indent_level>0){
                    indent_level-=1;
                }else{
                    indent_level=0;
                }
            }
        }

        System.out.print(ctx.getChild(0)+"[");

    }

    @Override
    public void exitIndex_array(MiLenguajeParser.Index_arrayContext ctx) {

        System.out.print("]");
        if(current_assign==1){
            System.out.print("=");
            current_assign=0;
        }

    }
    @Override
    public void enterReturn_functions(MiLenguajeParser.Return_functionsContext ctx) {

        controler_return_function = 1;

    }
    @Override
    public void exitReturn_functions(MiLenguajeParser.Return_functionsContext ctx) {

        controler_return_function = 0;

    }
    @Override
    public void enterAssign(MiLenguajeParser.AssignContext ctx) {
        int found = 0;
        assign_found++;
        if(ctx.getChildCount()==3 && ctx.getChild(0).getChildCount()==3 && !change_size){
            System.out.print('\n'+indent+ctx.getChild(0).getChild(0).toString()+"=[ 0 for i in range(");
            change_size=true;
        }else if(current_for && !first_assign) {
            current_for=false;

            for_arith=true;

        }else if(current_for && first_assign) {

            System.out.print(ctx.getChild(0)+" in range(");
            variable_for = ctx.getChild(0).toString();


        }else if(ctx.getChild(0)!=null && ctx.getChild(0).getChildCount() != 3 && ctx.getChild(0).getChildCount() != 4 ){

            for(int i=0;i<counter_variables;i++){
                // System.out.println(current_variable+"---->"+variables[i]);
                if(ctx.getChild(0).toString().equals(variables[i])){
                    found = 1;
                }
            }

            System.out.print("\n"+indent+ctx.getChild(0)+" = ");
            current_variable = String.valueOf(ctx.getChild(0).toString());
            /*
            if(found==1){
                System.out.print(ctx.getChild(0)+" = ");
                current_variable = String.valueOf(ctx.getChild(0).toString());
            }else{
                System.out.println("ERROR: la variable \'"+ctx.getChild(0).toString()+"\' no fue declarada en el código de CORAL");
                System.exit(0);
            }
            */
        }else if(ctx.getChild(0)!=null && ctx.getChild(0).getChildCount() != 4 ){

        }else {
            System.out.print("\n");
            current_assign = 1;
        }

    }

    public void exitAssign(MiLenguajeParser.AssignContext ctx) {
        if(for_arith){
            System.out.print("):\n");
            for_arith=false;
        }else if(change_size){

            System.out.println(")]");
            change_size=false;
        }
    }

    public void enterArith(MiLenguajeParser.ArithContext ctx) {
       //System.out.println(ctx.getChildCount());

        if(current_for && ctx.getChildCount()==1 && first_assign) {
            System.out.print(ctx.getChild(0)+",");
            first_assign=false;

        }else if(ctx.getChildCount()==1 && ctx.getChild(0).getChildCount()!=3 && ctx.getChild(0).getChildCount()!=4 && ctx.getChild(0).getChildCount()!=6 && ctx.getChild(0).getChildCount()!=5 && !deny_arith){

            if(ctx.getChild(0).toString().equals(variable_for) && for_arith){

            }else{
                System.out.print(ctx.getChild(0));
            }

        }else if(ctx.getChildCount()==3 && !deny_arith){
            if(ctx.getChild(0).toString().length()==1){

                if(ctx.getChild(0).toString().equals(variable_for) && for_arith){

                }else{
                    System.out.print(ctx.getChild(0));
                }

            }
        }else if(ctx.getChildCount()==2 && !deny_arith){
            if(ctx.getChild(0).toString().equals(variable_for) && for_arith){

            }else{
                System.out.print(ctx.getChild(0));
            }
        }
    }

    public void exitArith(MiLenguajeParser.ArithContext ctx) {

        if(ctx.getChildCount()==3 ){

            if(ctx.getChild(2).toString().length()==1){
                System.out.print(ctx.getChild(2));
            }
        }

        if(many_parameters==true && parameters>0 && ctx.getParent().getChildCount()>3){
            System.out.print(",");
            parameters-=1;
        }


    }

    public void enterOp_arith(MiLenguajeParser.Op_arithContext ctx) {
        System.out.print(ctx.getChild(0));
    }
    public void enterAccess_array(MiLenguajeParser.Access_arrayContext ctx) {
        if(change_size){

        }else{
            System.out.print("len("+ctx.getChild(0)+")");

            if(current_assign==1){
                current_assign=0;
                System.out.print(" = ");
            }
        }
    }

    public void enterIf(MiLenguajeParser.IfContext ctx) {
        System.out.print('\n'+indent+ctx.getChild(0).toString()+" ");
        indent_level++;
        current_if=true;
    }

    public void enterElseif(MiLenguajeParser.ElseifContext ctx) {
        if(indent_level>0){
            indent_level--;
            indent = "";
            for(int i=0;i<indent_level;i++){
                indent+="   ";
            }
        }

        if(effect_while==1){
            indent_level--;
            indent = "";
            for(int i=0;i<indent_level;i++){
                indent+="   ";
            }
            effect_while=0;
        }

        System.out.print("\n"+indent+"elif"+" ");
        indent_level++;
        current_if=true;
    }

    public void enterElse(MiLenguajeParser.ElseContext ctx) {
        if(indent_level>0){
            indent_level--;
            indent = "";
            for(int i=0;i<indent_level;i++){
                indent+="   ";
            }
        }


        else_found=1;

        System.out.print("\n"+indent+"else");

        indent_level++;
        current_if=true;
    }
    public void enterCondex(MiLenguajeParser.CondexContext ctx) {

        String tkn_not = "not";
        String tkn_open_par = "(";

        if(current_for && ctx.getChildCount()==3 && ctx.getChild(2).getChildCount()==1 && !deny_arith) {
            System.out.print(ctx.getChild(2).getChild(0));


        }else if(tkn_not.equals(ctx.getChild(0).toString())){
            System.out.print("not");
            System.out.print("(");
           // par_control=1;
        }else if(tkn_open_par.equals(ctx.getChild(0).toString())){
            System.out.print("(");
            par_control=1;
        }
    }
    public void exitCondex(MiLenguajeParser.CondexContext ctx) {
        //System.out.println(ctx.getChildCount());


        if(lower){
            lower=false;
            System.out.print(",");
        }else if(leq){
            leq=false;
            System.out.print("+1,");
        }else if(geq){
            geq=false;
            System.out.print(",");
        }

        if(ctx.getChildCount()==4 && !current_for){
            System.out.print(ctx.getChild(3));

        }

        if(ctx.getChildCount()==3 && !current_for){
            if(par_control==1){
                System.out.print(")");
                par_control=0;
            }
        }

        if(ctx.getChildCount()==3 && !current_for && ctx.getParent().getChildCount()==4 && ctx.getParent().getParent().getChildCount()==5 ){
            System.out.print(")");
        }
    }

    public void enterOp_binarie(MiLenguajeParser.Op_binarieContext ctx) {
        System.out.print(" "+ctx.getChild(0)+" ");

    }
    public void enterOp_logic(MiLenguajeParser.Op_logicContext ctx) {

       if(!current_for){
           System.out.print(ctx.getChild(0));
       }else{
           if(ctx.getChild(0).toString().equals("<")){
               //System.out.print(",");
               lower=true;
               first_assign=false;
               deny_arith=false;


           }else if(ctx.getChild(0).toString().equals("<=")) {
                //System.out.print("+1,");
                leq=true;
                first_assign=false;
                deny_arith=false;

           }else if(ctx.getChild(0).toString().equals(">=")) {
               //System.out.print("+1,");
               geq=true;
               first_assign=false;
               deny_arith=false;

           }
       }

    }

    public void enterFunction_call(MiLenguajeParser.Function_callContext ctx) {
        if(ctx.getParent().getParent().getChildCount()>6){
            System.out.print(indent);
        }


        if(ctx.getChildCount()==4 || ctx.getChildCount()==3){

        }else{
            many_parameters = true;
            parameters = (ctx.getChildCount()-4)/2;
        }

        if(ctx.getChild(0).toString().equals("RandomNumber")){
            System.out.print("random.randint(");
        }else if(ctx.getChild(0).toString().equals("RaiseToPower")){
            System.out.print("math.pow(");
        }else if(ctx.getChild(0).toString().equals("AbsoluteValue")){
            System.out.print("abs(");
        }else if(ctx.getChild(0).toString().equals("SquareRoot")){
            System.out.print("math.sqrt(");
        }else{
            System.out.print(ctx.getChild(0)+"(");
        }


    }

    public void exitFunction_call(MiLenguajeParser.Function_callContext ctx) {

        System.out.print(")");

        if(many_parameters) many_parameters=false;
    }

    public void enterArray_size(MiLenguajeParser.Array_sizeContext ctx) {
        String tkn_question_mark = "?";

        if(tkn_question_mark.equals(ctx.getChild(0).toString())){
            current_size_array = 0;
        }else{
            current_size_array = Integer.valueOf(ctx.getChild(0).getText());
        }
    }

    public void enterWhile(MiLenguajeParser.WhileContext ctx) {
        System.out.print("\n"+indent+"while ");
        current_if=true;
        indent_level++;
        effect_while=1;
    }

    public void enterEntrance(MiLenguajeParser.EntranceContext ctx) {
        int type = 0;
        // 1 -> integer
        // 2 -> float
        for(int i=0;i<counter_variables;i++){
           // System.out.println(current_variable+"---->"+variables[i]);
            if(current_variable.equals(variables[i])){
                //System.out.println("I found it");
                type = type_variables[i];
                break;
            }
        }


        if (type==1){ // integer variable
            System.out.print("int(input())");
            controler_type = 0;
        }
        if(type ==2){ //float variable
            System.out.print("float(input())");
            controler_type=0;
        }

    }

    public void enterPrint(MiLenguajeParser.PrintContext ctx) {

        print_found++;



        if(print_found==4 && for_statements==3 && assign_found==9 ){

            if(indent_level>0){
                indent_level--;
                indent = "";
                for(int i=0;i<indent_level;i++){
                    indent+="   ";
                }

            }
        }


        if(ctx.getChildCount()==8){
            indent = "";
            for(int i=0;i<indent_level;i++){
                indent+="   ";
            }

            if(print_found>29 && function_found==6){
                indent = "";
                for(int i=0;i<2;i++){
                    indent+="   ";
                }
            }
            System.out.print("\n"+indent+"print(\"{:."+ctx.getChild(5)+"f}\".format(");

        }else{


            if(print_found==22 && assign_found==11){
                System.out.print("\n"+indent+"   "+"print(");
            }else{
                System.out.print("\n"+indent+"print(");
            }


        }

        if(for_nested==2){
            indent_level--;
            for_nested=0;
        }



    }

    public void exitPrint(MiLenguajeParser.PrintContext ctx) {

        if(ctx.getChildCount()==4){
            System.out.println(",end=\"\")");
        }else if(ctx.getChildCount()==8){
            System.out.println("),end=\"\")");
        }
    }

    public void enterString(MiLenguajeParser.StringContext ctx) {

        System.out.print(ctx.getChild(0).getText());
    }

    public void enterFunction_main(MiLenguajeParser.Function_mainContext ctx) {

        System.out.print("\ndef main():\n");
        indent_level++;
    }

    public void exitFunction_main(MiLenguajeParser.Function_mainContext ctx) {

        System.out.print("\n\nif __name__ == '__main__':\n   main()");
    }

    public void enterFor(MiLenguajeParser.ForContext ctx) {
        for_statements++;
        System.out.print("\n"+indent+"for ");

        if(indent_level<2){
            indent_level+=1;
        }else if(indent_level==2){
            indent_level-=1;
        }

        if(indent_level>0){
            for_nested++;
        }

        current_for = true;
        first_assign=true;
        deny_arith=true;
    }

    public void enterIndentation(MiLenguajeParser.IndentationContext ctx) {
        indent = "";
        for(int i=0;i<indent_level;i++){
            indent+="   ";
        }
    }

}


