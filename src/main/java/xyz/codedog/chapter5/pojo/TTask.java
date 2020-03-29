package xyz.codedog.chapter5.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * t_task
 * @author 
 */
@Data
public class TTask implements Serializable {
    private Integer id;

    private String title;

    private String context;

    private String note;

    private static final long serialVersionUID = 1L;
}