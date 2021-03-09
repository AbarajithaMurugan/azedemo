@reg
Feature: verify Adactin page 

Background: Open in Background
Given User enters background line one
When User enters background line two
@reg
Scenario: User is in Scenario one
Given User enters Scenario one line one
When User enters Scenario one line two
@sanity
Scenario: User is in Scenario two
Given User enters Scenario two line one
When User enters Scenario two line two
@reg @sanity
Scenario: User is in Scenario three
Given User enters Scenario three line one
When User enters Scenario three line two
