package com.leena.spring.jdbc.batchInsert;

import java.util.*;

public interface EmployEDAO {

    public int[][] batchInsert(final List<EmployE> employees);

}
