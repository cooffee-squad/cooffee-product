create table coffee_bean
(
    id                       uuid not null primary key,
    is_acidity               boolean,
    is_decaffeine            boolean,
    is_single_origin         boolean,
    price                    float4,
    roasting_type            smallint check (roasting_type between 0 and 4),
    trade_type               smallint check (trade_type between 0 and 1),
    roastery_id              uuid,
    description              TEXT,
    blend_list               jsonb,
    flavornotes              jsonb,
    matched_coffee_tool_type jsonb,
    matched_reciept          jsonb,
    processing_type          jsonb
);

create table roastery
(
    roastery_id  uuid not null primary key,
    description  TEXT,
    instagram_id TEXT,
    location     TEXT,
    career_list  jsonb
);
