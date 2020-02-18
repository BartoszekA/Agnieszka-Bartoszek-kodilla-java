package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class CompanyFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public Company saveCompany(Company company) {
        return companyDao.save(company);
    }

    public Company findCompanyByPartName(String partOfName) {
        return companyDao.findCompanyByPartName("%" + partOfName + "%");
    }

    public void deleteCompanyById(int id) {
        companyDao.deleteById(id);
    }

    public Employee retrieveEmployee(String partOfName) {
        return employeeDao.retrieveEmployee("%" + partOfName + "%");
    }


}
