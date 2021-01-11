package kz.edu.astanait;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/searchRest")
public class SearchRest {
    private final SearchStart start = new SearchStart();

    @GET
    @Path("/{searchInput}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("searchInput") String searchInput) {
        DTO dto = new DTO();
        try{
            dto.setMap(start.startThreadInFile(searchInput));
            dto.setFrequency(start.startThreadName(searchInput));
        } catch (BadRequestException e) {
            return Response
                    .notModified()
                    .entity("Not found")
                    .build();
        }
        return Response
                .ok(dto)
                .build();
    }
}
