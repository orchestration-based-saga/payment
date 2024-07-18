create table if not exists payment(
    id uuid not null constraint payment_pkey primary key,
    transaction_id uuid not null,
    order_id text not null,
    transaction_amount numeric(15, 2) not null,
    paid_amount numeric(15, 2),
    status text not null,
    bank_transaction_id text,
    customer_id uuid not null
)