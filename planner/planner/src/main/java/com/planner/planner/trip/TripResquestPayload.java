package com.planner.planner.trip;

import java.util.List;

public record TripResquestPayload(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {
}
