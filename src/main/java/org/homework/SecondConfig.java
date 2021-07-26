package org.homework;

import org.homework.beans3.BeanD;
import org.homework.beans3.BeanF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScans({
        @ComponentScan(basePackages = "org.homework.beans2"),
        @ComponentScan(basePackages = "org.homework.beans3",
                excludeFilters = @ComponentScan.Filter
                        (type = FilterType.REGEX, pattern = ".*E"))
})
public class SecondConfig {
}
