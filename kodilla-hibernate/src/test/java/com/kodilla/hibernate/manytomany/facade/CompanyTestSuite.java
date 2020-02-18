package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyTestSuite {

    @Autowired
    CompanyFacade companyFacade;

    @Test
    public void testFindCompany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.saveCompany(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyFacade.saveCompany(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        Company company1 = companyFacade.findCompanyByPartName("aest");
        Company company2 = companyFacade.findCompanyByPartName("Mach");
        Company company3 = companyFacade.findCompanyByPartName("Grey");

        //Then
        Assert.assertEquals(dataMaestersId, company1.getId());
        Assert.assertEquals(softwareMachineId, company2.getId());
        Assert.assertEquals(greyMatterId, company3.getId());

        //CleanUp
        try {
            companyFacade.deleteCompanyById(softwareMachineId);
            companyFacade.deleteCompanyById(dataMaestersId);
            companyFacade.deleteCompanyById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.saveCompany(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyFacade.saveCompany(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        Employee employee1 = companyFacade.retrieveEmployee("mit");
        String employeeFirstname1 = employee1.getFirstname();
        Employee employee2 = companyFacade.retrieveEmployee("son");
        String employeeFirstname2 = employee2.getFirstname();
        Employee employee3 = companyFacade.retrieveEmployee("Kov");
        String employeeFirstname3 = employee3.getFirstname();

        //Then
        Assert.assertEquals("John", employeeFirstname1);
        Assert.assertEquals("Stephanie", employeeFirstname2);
        Assert.assertEquals("Linda", employeeFirstname3);

        //CleanUp
        try {
            companyFacade.deleteCompanyById(softwareMachineId);
            companyFacade.deleteCompanyById(dataMaestersId);
            companyFacade.deleteCompanyById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}
