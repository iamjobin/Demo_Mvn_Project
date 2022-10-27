/**
 * 
 */
package userservices.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author gmanr
 *
 */

@Getter
@Setter
public class PageResponse<T> implements Serializable {

    /**
     * Page information.
     */
    Page page;
    
    /**
     * The content of the page.
     */
    List<T> content;
    
}
