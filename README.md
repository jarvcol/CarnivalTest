# CarnivalTest

Test of the following requirements
1) Escenario de login inválido. Completed. 
This scenario could have been improve if I change the hardcoded data and move it to the feature file.

2) Escenario búsqueda de Cruceros. Completed.
Builder pattern was not implemented on this case. It could have been implemented to create the tasks objects that performs the SearchCruise.

3) Añadir habilidad al actor. Completed.
Interactions of SELECT, INSERT, UPDATE and DELETE (DML) were implemented over a Postgres DB. Postgres DB back up is located on /dbBackUp/dbBackUp.
Feature to test it was implemented, still I am aware that I am missing a way to verify actions over the DB. I have not been able to find out how to return a Result set from an Interaction and then do the validation on the questions class.
Stackoverflow question to solve this: https://stackoverflow.com/questions/54495073/how-to-return-a-value-from-an-interaction

4) API test. Completed.
I tried to follow as many examples as possible but could not implemented in the way I intended to do it (using net.serenitybdd.screenplay.rest.interactions) there was always an error that was being thrown and I asked for help here: https://stackoverflow.com/questions/54472152/net-serenitybdd-core-exceptions-serenitymanagedexception-serenity-disable-rest.
Anyway, I endedup implementing this test the way I could do it using net.serenitybdd.rest.SerenityRest.
Please note difference in file jarv.serenity.carnival.features.steps.steps.RecoverPasswordSteps between master and apiOriginalApproach

To run it it is just needed to have JAVA 1.8+ and maven installed. 
PLease run: "mvn -Dwebdriver.driver=chrome verify" to run it in Chrome, if needed on Firefox simply change to "mvn -Dwebdriver.driver=firefox verify"

Thanks!
