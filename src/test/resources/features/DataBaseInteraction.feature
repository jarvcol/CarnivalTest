Feature: Data base interaction test
  Users need to be able apply DML operations on a DataBase

  Scenario: Attempt to execute operations on data base
    Given Jorge wants to execute operations on a data base
    When he attempts to do an insert
    #Then he should see a register on the data base
    When he attempts to do an update
    #Then he should see the new register data
    When he attempts to do a delete
    #Then he should not see any register on the data base